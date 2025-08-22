package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MINTT device specifications for Android Compose previews.
 *
 * This extension provides MINTT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MINTT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MINTT: Any
  get() = object {
      /** DeviceSpec(manufacturer=MINTT, code=CoolMintt_Blaze_2, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MINTT, code=CoolMintt_Blaze_2,
      width=480, height=854, dpi=200, isGoogleDevice=false).code */
      val COOLMINTT_BLAZE_2 = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=MINTT, code=CoolMintt_Rival, width=480, height=1014, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MINTT, code=CoolMintt_Rival,
      width=480, height=1014, dpi=220, isGoogleDevice=false).code */
      val COOLMINTT_RIVAL = "spec:width=480,height=1014,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=MINTT, code=Mintt_M3, width=720, height=1560, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MINTT, code=Mintt_M3, width=720,
      height=1560, dpi=300, isGoogleDevice=false).code */
      val MINTT_M3 = "spec:width=720,height=1560,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=MINTT, code=MINTT_M5, width=480, height=960, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MINTT, code=MINTT_M5, width=480,
      height=960, dpi=220, isGoogleDevice=false).code */
      val MINTT_M5 = "spec:width=480,height=960,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=MINTT, code=MINTT_T11, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MINTT, code=MINTT_T11, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MINTT_T11 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MINTT, code=T3, width=800, height=1340, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MINTT, code=T3, width=800,
      height=1340, dpi=213, isGoogleDevice=false).code */
      val T3 = "spec:width=800,height=1340,unit=px,dpi=213"

  }
