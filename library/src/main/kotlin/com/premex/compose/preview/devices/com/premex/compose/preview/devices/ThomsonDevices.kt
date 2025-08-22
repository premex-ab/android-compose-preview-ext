package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Thomson device specifications for Android Compose previews.
 *
 * This extension provides Thomson device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Thomson.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Thomson: Any
  get() = object {
      /** DeviceSpec(manufacturer=Thomson, code=EBL_5304G, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Thomson, code=EBL_5304G, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val EBL_5304G = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Thomson, code=guandu, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Thomson, code=guandu, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val GUANDU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Thomson, code=laoshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Thomson, code=laoshan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LAOSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Thomson, code=LAS, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Thomson, code=LAS, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LAS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Thomson, code=marina, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Thomson, code=marina, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val MARINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Thomson, code=martin, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Thomson, code=martin, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Thomson, code=nagata, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Thomson, code=nagata, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NAGATA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Thomson, code=Origin_1010, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Thomson, code=Origin_1010,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ORIGIN_1010 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Thomson, code=Origin_679, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Thomson, code=Origin_679,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val ORIGIN_679 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Thomson, code=SW6H, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Thomson, code=SW6H, width=1080,
      height=1920, dpi=160, isGoogleDevice=false).code */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Thomson, code=TEOX102, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Thomson, code=TEOX102, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TEOX102 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Thomson, code=TEOX103, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Thomson, code=TEOX103, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TEOX103 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Thomson, code=YDA, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Thomson, code=YDA, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val YDA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
