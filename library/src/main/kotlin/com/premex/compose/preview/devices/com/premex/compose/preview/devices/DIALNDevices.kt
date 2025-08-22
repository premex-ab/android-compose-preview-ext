package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DIALN device specifications for Android Compose previews.
 *
 * This extension provides DIALN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DIALN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DIALN: Any
  get() = object {
      /** DeviceSpec(manufacturer=DIALN, code=G10, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIALN, code=G10, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val G10 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=DIALN, code=G65, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIALN, code=G65, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DIALN, code=S10, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIALN, code=S10, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val S10 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=DIALN, code=S8, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIALN, code=S8, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val S8 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DIALN, code=X10G, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIALN, code=X10G, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val X10G = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=DIALN, code=X10ULTRA, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIALN, code=X10ULTRA, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val X10ULTRA = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=DIALN, code=X10_Pulse, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIALN, code=X10_Pulse, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val X10_PULSE = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=DIALN, code=X62S, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIALN, code=X62S, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val X62S = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DIALN, code=X8G, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIALN, code=X8G, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val X8G = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DIALN, code=X8ULTRA, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIALN, code=X8ULTRA, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val X8ULTRA = "spec:width=800,height=1280,unit=px,dpi=240"

  }
