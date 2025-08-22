package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Caltta device specifications for Android Compose previews.
 *
 * This extension provides Caltta device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Caltta.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Caltta: Any
  get() = object {
      /** Caltta e720 */
      val E720 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
