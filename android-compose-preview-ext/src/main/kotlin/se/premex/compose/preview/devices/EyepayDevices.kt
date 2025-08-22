package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * EyePay device specifications for Android Compose previews.
 *
 * This extension provides EyePay device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Eyepay.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Eyepay: Any
  get() = object {
      /** EyePay IG-EP100 */
      val IG_EP100 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
