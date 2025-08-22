package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * STF device specifications for Android Compose previews.
 *
 * This extension provides STF device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.STF.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.STF: Any
  get() = object {
      /** DeviceSpec(manufacturer=STF, code=AURA, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STF, code=AURA, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val AURA = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=STF, code=Block, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STF, code=Block, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val BLOCK = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=STF, code=BLOCK_3, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STF, code=BLOCK_3, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val BLOCK_3 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=STF, code=BLOCK_GO, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STF, code=BLOCK_GO, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val BLOCK_GO = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=STF, code=BLOCK_MINI, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STF, code=BLOCK_MINI, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val BLOCK_MINI = "spec:width=480,height=800,unit=px,dpi=240"

  }
