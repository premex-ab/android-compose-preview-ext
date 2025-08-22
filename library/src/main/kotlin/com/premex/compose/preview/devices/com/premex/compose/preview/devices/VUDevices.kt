package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VU device specifications for Android Compose previews.
 *
 * This extension provides VU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VU.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VU: Any
  get() = object {
      /** DeviceSpec(manufacturer=VU, code=hamamatsucho, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VU, code=hamamatsucho, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val HAMAMATSUCHO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=VU, code=hengshan, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VU, code=hengshan, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val HENGSHAN = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VU, code=huangshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VU, code=huangshan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HUANGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VU, code=ikebukuro, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VU, code=ikebukuro, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=VU, code=keoneae, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VU, code=keoneae, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KEONEAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VU, code=laoshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VU, code=laoshan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LAOSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VU, code=longshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VU, code=longshan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VU, code=lushan, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VU, code=lushan, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val LUSHAN = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VU, code=samseong, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VU, code=samseong, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VU, code=songshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VU, code=songshan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VU, code=wuyishan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VU, code=wuyishan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val WUYISHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VU, code=xiaoyushan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VU, code=xiaoyushan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val XIAOYUSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
