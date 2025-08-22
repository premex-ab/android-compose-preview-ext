package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Meitu device specifications for Android Compose previews.
 *
 * This extension provides Meitu device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Meitu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Meitu: Any
  get() = object {
      /** DeviceSpec(manufacturer=Meitu, code=M6, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Meitu, code=M6, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val M6 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Meitu, code=Maya, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Meitu, code=Maya, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val MAYA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Meitu, code=MayaS, width=1080, height=2220, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Meitu, code=MayaS, width=1080,
      height=2220, dpi=440, isGoogleDevice=false).code */
      val MAYAS = "spec:width=1080,height=2220,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Meitu, code=Melody, width=1080, height=2244, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Meitu, code=Melody, width=1080,
      height=2244, dpi=480, isGoogleDevice=false).code */
      val MELODY = "spec:width=1080,height=2244,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Meitu, code=Tiffany, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Meitu, code=Tiffany, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val TIFFANY = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Meitu, code=vela, width=1080, height=2340, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Meitu, code=vela, width=1080,
      height=2340, dpi=440, isGoogleDevice=false).code */
      val VELA = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Meitu, code=Victoria, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Meitu, code=Victoria, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val VICTORIA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Meitu, code=VictoriaS, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Meitu, code=VictoriaS, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val VICTORIAS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Meitu, code=Vivian, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Meitu, code=Vivian, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val VIVIAN = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
