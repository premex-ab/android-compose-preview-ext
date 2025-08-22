package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Ematic device specifications for Android Compose previews.
 *
 * This extension provides Ematic device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ematic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ematic: Any
  get() = object {
      /** DeviceSpec(manufacturer=Ematic, code=DV8235, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ematic, code=DV8235, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8235 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Ematic, code=EGQ101, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ematic, code=EGQ101, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val EGQ101 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Ematic, code=EGQ235SK, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ematic, code=EGQ235SK, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val EGQ235SK = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Ematic, code=EGQ236BD, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ematic, code=EGQ236BD, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val EGQ236BD = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Ematic, code=EGQ238BD, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ematic, code=EGQ238BD, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val EGQ238BD = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Ematic, code=EGQ239BD, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ematic, code=EGQ239BD, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val EGQ239BD = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Ematic, code=Jetstream, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ematic, code=Jetstream, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val JETSTREAM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Ematic, code=PBSKD12, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ematic, code=PBSKD12, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val PBSKD12 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Ematic, code=PBSKD7001, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ematic, code=PBSKD7001, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val PBSKD7001 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Ematic, code=PBSKD7200, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ematic, code=PBSKD7200, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val PBSKD7200 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
