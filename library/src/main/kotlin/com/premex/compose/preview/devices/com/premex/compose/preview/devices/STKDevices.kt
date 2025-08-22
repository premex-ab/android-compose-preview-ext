package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * STK device specifications for Android Compose previews.
 *
 * This extension provides STK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.STK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.STK: Any
  get() = object {
      /** DeviceSpec(manufacturer=STK, code=cayenne, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STK, code=cayenne, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CAYENNE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=STK, code=Evo_2, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STK, code=Evo_2, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val EVO_2 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=STK, code=STK_Sync_5e, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STK, code=STK_Sync_5e, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val STK_SYNC_5E = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=STK, code=STK_Transporter_1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STK, code=STK_Transporter_1,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val STK_TRANSPORTER_1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=STK, code=STK_X2, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STK, code=STK_X2, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val STK_X2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=STK, code=X3, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STK, code=X3, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val X3 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
