package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ALLDOCUBE device specifications for Android Compose previews.
 *
 * This extension provides ALLDOCUBE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ALLDOCUBE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ALLDOCUBE: Any
  get() = object {
      /** DeviceSpec(manufacturer=ALLDOCUBE, code=iPlay_70_mini_Ultra, width=1600, height=2560,
      dpi=340, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLDOCUBE,
      code=iPlay_70_mini_Ultra, width=1600, height=2560, dpi=340, isGoogleDevice=false).code */
      val IPLAY_70_MINI_ULTRA = "spec:width=1600,height=2560,unit=px,dpi=340"

      /** DeviceSpec(manufacturer=ALLDOCUBE, code=T1001, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLDOCUBE, code=T1001, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val T1001 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALLDOCUBE, code=T701, width=720, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLDOCUBE, code=T701, width=720,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val T701 = "spec:width=720,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALLDOCUBE, code=T806, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLDOCUBE, code=T806, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T806 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ALLDOCUBE, code=T806ME, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLDOCUBE, code=T806ME, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T806ME = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ALLDOCUBE, code=T806MH, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLDOCUBE, code=T806MH, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T806MH = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ALLDOCUBE, code=U1005, width=1600, height=2560, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLDOCUBE, code=U1005, width=1600,
      height=2560, dpi=240, isGoogleDevice=false).code */
      val U1005 = "spec:width=1600,height=2560,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALLDOCUBE, code=U1005E, width=1600, height=2560, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLDOCUBE, code=U1005E, width=1600,
      height=2560, dpi=240, isGoogleDevice=false).code */
      val U1005E = "spec:width=1600,height=2560,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALLDOCUBE, code=U1006, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLDOCUBE, code=U1006, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val U1006 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALLDOCUBE, code=U1006E, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLDOCUBE, code=U1006E, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val U1006E = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALLDOCUBE, code=U1006H, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLDOCUBE, code=U1006H, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val U1006H = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ALLDOCUBE, code=U63PLUS, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALLDOCUBE, code=U63PLUS, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val U63PLUS = "spec:width=800,height=1280,unit=px,dpi=240"

  }
