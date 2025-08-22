package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TaipeiNet device specifications for Android Compose previews.
 *
 * This extension provides TaipeiNet device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Taipeinet.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Taipeinet: Any
  get() = object {
      /** TaipeiNet HY40A3 */
      val HY40A3 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
