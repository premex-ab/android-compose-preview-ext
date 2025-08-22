package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * jyonetsu_kakaku device specifications for Android Compose previews.
 *
 * This extension provides jyonetsu_kakaku device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.JyonetsuKakaku.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.JyonetsuKakaku: Any
  get() = object {
      /** jyonetsu_kakaku YMR8 */
      val YMR8 = "spec:width=768,height=1024,unit=px,dpi=160"

  }
