package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GPLUS device specifications for Android Compose previews.
 *
 * This extension provides GPLUS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GPLUS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GPLUS: Any
  get() = object {
      /** DeviceSpec(manufacturer=GPLUS, code=GNE-N001S, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GPLUS, code=GNE-N001S, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val GNE_N001S = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=GPLUS, code=GNE_N003S, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GPLUS, code=GNE_N003S, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val GNE_N003S = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=GPLUS, code=GPLUS_A2_Plus, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GPLUS, code=GPLUS_A2_Plus,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val GPLUS_A2_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GPLUS, code=GPLUS_FW6950, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GPLUS, code=GPLUS_FW6950,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val GPLUS_FW6950 = "spec:width=720,height=1280,unit=px,dpi=213"

  }
