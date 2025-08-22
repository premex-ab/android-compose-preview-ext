package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SonyAudio device specifications for Android Compose previews.
 *
 * This extension provides SonyAudio device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sonyaudio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sonyaudio: Any
  get() = object {
      /** SonyAudio icx1293 */
      val ICX1293 = "spec:width=720,height=1280,unit=px,dpi=360"

      /** SonyAudio icx1295 */
      val ICX1295 = "spec:width=720,height=1280,unit=px,dpi=360"

      /** SonyAudio icx1298 */
      val ICX1298 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SonyAudio icx1301 */
      val ICX1301 = "spec:width=720,height=1280,unit=px,dpi=400"

      /** SonyAudio icx1302 */
      val ICX1302 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
