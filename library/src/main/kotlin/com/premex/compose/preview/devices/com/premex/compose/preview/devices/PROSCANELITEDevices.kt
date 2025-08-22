package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PROSCAN_ELITE device specifications for Android Compose previews.
 *
 * This extension provides PROSCAN_ELITE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PROSCANELITE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PROSCANELITE: Any
  get() = object {
      /** DeviceSpec(manufacturer=PROSCAN_ELITE, code=mdt1008_mr_32, width=800, height=1280,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PROSCAN_ELITE,
      code=mdt1008_mr_32, width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val MDT1008_MR_32 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
