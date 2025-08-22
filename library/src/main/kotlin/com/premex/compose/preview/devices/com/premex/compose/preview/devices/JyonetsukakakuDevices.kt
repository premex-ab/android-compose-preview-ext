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
 * @Preview(device = Devices.Jyonetsukakaku.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Jyonetsukakaku: Any
  get() = object {
      /** DeviceSpec(manufacturer=jyonetsu_kakaku, code=YMR8, width=768, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=jyonetsu_kakaku, code=YMR8,
      width=768, height=1024, dpi=160, isGoogleDevice=false).code */
      val YMR8 = "spec:width=768,height=1024,unit=px,dpi=160"

  }
