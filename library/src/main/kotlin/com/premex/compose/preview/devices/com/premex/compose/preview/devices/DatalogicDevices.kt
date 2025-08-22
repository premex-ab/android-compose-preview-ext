package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Datalogic device specifications for Android Compose previews.
 *
 * This extension provides Datalogic device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Datalogic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Datalogic: Any
  get() = object {
      /** DeviceSpec(manufacturer=Datalogic, code=dl35, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Datalogic, code=dl35, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val DL35 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Datalogic, code=m11, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Datalogic, code=m11, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val M11 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Datalogic, code=M1_HANDHELD, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Datalogic, code=M1_HANDHELD,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val M1_HANDHELD = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Datalogic, code=nebula_pda, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Datalogic, code=nebula_pda,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val NEBULA_PDA = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Datalogic, code=Q10, width=1080, height=2160, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Datalogic, code=Q10, width=1080,
      height=2160, dpi=440, isGoogleDevice=false).code */
      val Q10 = "spec:width=1080,height=2160,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Datalogic, code=Q10A, width=1080, height=2160, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Datalogic, code=Q10A, width=1080,
      height=2160, dpi=440, isGoogleDevice=false).code */
      val Q10A = "spec:width=1080,height=2160,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Datalogic, code=sx5, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Datalogic, code=sx5, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val SX5 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Datalogic, code=tomcat_pda, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Datalogic, code=tomcat_pda,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val TOMCAT_PDA = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
