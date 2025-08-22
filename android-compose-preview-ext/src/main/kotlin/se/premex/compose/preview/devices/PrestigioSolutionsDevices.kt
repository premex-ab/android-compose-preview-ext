package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Prestigio_Solutions device specifications for Android Compose previews.
 *
 * This extension provides Prestigio_Solutions device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PrestigioSolutions.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PrestigioSolutions: Any
  get() = object {
      /** Prestigio_Solutions HE10A3L */
      val HE10A3L = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Prestigio_Solutions HP80A33L */
      val HP80A33L = "spec:width=800,height=1280,unit=px,dpi=213"

  }
