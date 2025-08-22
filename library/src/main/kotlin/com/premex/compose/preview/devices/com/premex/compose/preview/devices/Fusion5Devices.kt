package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Fusion5 device specifications for Android Compose previews.
 *
 * This extension provides Fusion5 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fusion5.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fusion5: Any
  get() = object {
      /** DeviceSpec(manufacturer=Fusion5, code=F104Bv2_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fusion5, code=F104Bv2_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val F104BV2_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Fusion5, code=F104Ev2, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fusion5, code=F104Ev2, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val F104EV2 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Fusion5, code=F104Ev2_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fusion5, code=F104Ev2_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val F104EV2_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Fusion5, code=F104EvII, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fusion5, code=F104EvII, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val F104EVII = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Fusion5, code=F104EvII_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fusion5, code=F104EvII_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val F104EVII_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Fusion5, code=F105DvII, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fusion5, code=F105DvII, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val F105DVII = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Fusion5, code=F105D_128, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fusion5, code=F105D_128,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val F105D_128 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Fusion5, code=F202_8G, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fusion5, code=F202_8G, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val F202_8G = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Fusion5, code=F202_8G_EEA, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fusion5, code=F202_8G_EEA,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val F202_8G_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Fusion5, code=F202_UK, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fusion5, code=F202_UK, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val F202_UK = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Fusion5, code=F202_US, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fusion5, code=F202_US, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val F202_US = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Fusion5, code=F202_v2_EEA, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fusion5, code=F202_v2_EEA,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val F202_V2_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Fusion5, code=Fusion5_F104Bv2, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fusion5, code=Fusion5_F104Bv2,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val FUSION5_F104BV2 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Fusion5, code=Fusion5_F104E, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fusion5, code=Fusion5_F104E,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val FUSION5_F104E = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Fusion5, code=Fusion5_F105D, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fusion5, code=Fusion5_F105D,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val FUSION5_F105D = "spec:width=800,height=1280,unit=px,dpi=160"

  }
