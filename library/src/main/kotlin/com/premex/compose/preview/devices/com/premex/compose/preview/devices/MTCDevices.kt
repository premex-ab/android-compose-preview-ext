package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MTC device specifications for Android Compose previews.
 *
 * This extension provides MTC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MTC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MTC: Any
  get() = object {
      /** DeviceSpec(manufacturer=MTC, code=Osmartphona, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MTC, code=Osmartphona, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val OSMARTPHONA = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MTC, code=Osmartphona_Tablet, width=800, height=1280, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MTC, code=Osmartphona_Tablet,
      width=800, height=1280, dpi=220, isGoogleDevice=false).code */
      val OSMARTPHONA_TABLET = "spec:width=800,height=1280,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=MTC, code=SMART_Race2_4G, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MTC, code=SMART_Race2_4G,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val SMART_RACE2_4G = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MTC, code=SMART_Sprint_4G, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MTC, code=SMART_Sprint_4G,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val SMART_SPRINT_4G = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MTC, code=SMART_Surf2_4G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MTC, code=SMART_Surf2_4G,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val SMART_SURF2_4G = "spec:width=720,height=1280,unit=px,dpi=320"

  }
