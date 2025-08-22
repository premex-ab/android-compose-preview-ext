package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Alphatel device specifications for Android Compose previews.
 *
 * This extension provides Alphatel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Alphatel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Alphatel: Any
  get() = object {
      /** DeviceSpec(manufacturer=Alphatel, code=Alphatel_T1, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alphatel, code=Alphatel_T1,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ALPHATEL_T1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Alphatel, code=T1_pro, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alphatel, code=T1_pro, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val T1_PRO = "spec:width=600,height=1024,unit=px,dpi=213"

  }
