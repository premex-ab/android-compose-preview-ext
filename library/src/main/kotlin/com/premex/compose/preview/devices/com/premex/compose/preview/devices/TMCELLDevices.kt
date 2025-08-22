package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TM_CELL device specifications for Android Compose previews.
 *
 * This extension provides TM_CELL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TMCELL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TMCELL: Any
  get() = object {
      /** DeviceSpec(manufacturer=TM_CELL, code=LOGIC_X60_PLUS, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TM_CELL, code=LOGIC_X60_PLUS,
      width=600, height=1280, dpi=240, isGoogleDevice=false).code */
      val LOGIC_X60_PLUS = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TM_CELL, code=UNONU_W60_PLUS, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TM_CELL, code=UNONU_W60_PLUS,
      width=600, height=1280, dpi=240, isGoogleDevice=false).code */
      val UNONU_W60_PLUS = "spec:width=600,height=1280,unit=px,dpi=240"

  }
