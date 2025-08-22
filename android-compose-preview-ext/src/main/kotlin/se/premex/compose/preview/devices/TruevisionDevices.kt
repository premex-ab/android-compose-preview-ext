package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TrueVision device specifications for Android Compose previews.
 *
 * This extension provides TrueVision device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Truevision.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Truevision: Any
  get() = object {
      /** TrueVision TV_A01 */
      val TV_A01 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
