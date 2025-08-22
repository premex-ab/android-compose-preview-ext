package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Satewave device specifications for Android Compose previews.
 *
 * This extension provides Satewave device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Satewave.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Satewave: Any
  get() = object {
      /** Satewave HPAD-IP8045 */
      val HPAD_IP8045 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
