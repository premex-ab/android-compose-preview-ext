package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * redbeat device specifications for Android Compose previews.
 *
 * This extension provides redbeat device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Redbeat.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Redbeat: Any
  get() = object {
      /** DeviceSpec(manufacturer=redbeat, code=D5, width=540, height=1200, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=redbeat, code=D5, width=540,
      height=1200, dpi=240, isGoogleDevice=false).code */
      val D5 = "spec:width=540,height=1200,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=redbeat, code=E3, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=redbeat, code=E3, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val E3 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=redbeat, code=redbeatA2, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=redbeat, code=redbeatA2, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val REDBEATA2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=redbeat, code=redbeatC1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=redbeat, code=redbeatC1, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val REDBEATC1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=redbeat, code=redbeatM2, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=redbeat, code=redbeatM2,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val REDBEATM2 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
