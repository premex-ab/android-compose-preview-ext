package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Unihertz device specifications for Android Compose previews.
 *
 * This extension provides Unihertz device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Unihertz.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Unihertz: Any
  get() = object {
      /** DeviceSpec(manufacturer=Unihertz, code=Atom, width=240, height=432, dpi=120,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Unihertz, code=Atom, width=240,
      height=432, dpi=120, isGoogleDevice=false).code */
      val ATOM = "spec:width=240,height=432,unit=px,dpi=120"

      /** DeviceSpec(manufacturer=Unihertz, code=Atom_L, width=640, height=1136, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Unihertz, code=Atom_L, width=640,
      height=1136, dpi=300, isGoogleDevice=false).code */
      val ATOM_L = "spec:width=640,height=1136,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=Unihertz, code=Atom_XL, width=640, height=1136, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Unihertz, code=Atom_XL, width=640,
      height=1136, dpi=300, isGoogleDevice=false).code */
      val ATOM_XL = "spec:width=640,height=1136,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=Unihertz, code=Jelly2, width=480, height=854, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Unihertz, code=Jelly2, width=480,
      height=854, dpi=220, isGoogleDevice=false).code */
      val JELLY2 = "spec:width=480,height=854,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=Unihertz, code=Jelly2_JP, width=480, height=854, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Unihertz, code=Jelly2_JP,
      width=480, height=854, dpi=220, isGoogleDevice=false).code */
      val JELLY2_JP = "spec:width=480,height=854,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=Unihertz, code=Jelly_2E, width=480, height=854, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Unihertz, code=Jelly_2E, width=480,
      height=854, dpi=220, isGoogleDevice=false).code */
      val JELLY_2E = "spec:width=480,height=854,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=Unihertz, code=Jelly_Max, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Unihertz, code=Jelly_Max,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val JELLY_MAX = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Unihertz, code=Jelly_Star, width=480, height=854, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Unihertz, code=Jelly_Star,
      width=480, height=854, dpi=220, isGoogleDevice=false).code */
      val JELLY_STAR = "spec:width=480,height=854,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=Unihertz, code=Luna, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Unihertz, code=Luna, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val LUNA = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Unihertz, code=TANK_01, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Unihertz, code=TANK_01, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val TANK_01 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Unihertz, code=Ticktock, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Unihertz, code=Ticktock,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val TICKTOCK = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Unihertz, code=TickTock-S, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Unihertz, code=TickTock-S,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val TICKTOCK_S = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Unihertz, code=Titan, width=1440, height=1440, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Unihertz, code=Titan, width=1440,
      height=1440, dpi=400, isGoogleDevice=false).code */
      val TITAN = "spec:width=1440,height=1440,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=Unihertz, code=Titan_pocket, width=720, height=720, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Unihertz, code=Titan_pocket,
      width=720, height=720, dpi=220, isGoogleDevice=false).code */
      val TITAN_POCKET = "spec:width=720,height=720,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=Unihertz, code=Titan_Slim, width=768, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Unihertz, code=Titan_Slim,
      width=768, height=1280, dpi=320, isGoogleDevice=false).code */
      val TITAN_SLIM = "spec:width=768,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Unihertz, code=UNIA62, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Unihertz, code=UNIA62, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val UNIA62 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
