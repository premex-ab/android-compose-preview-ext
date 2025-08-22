package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SPRD device specifications for Android Compose previews.
 *
 * This extension provides SPRD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SPRD.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SPRD: Any
  get() = object {
      /** DeviceSpec(manufacturer=SPRD, code=sp7731e_1h10, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPRD, code=sp7731e_1h10, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val SP7731E_1H10 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SPRD, code=sp9832a_2h11_volte, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPRD, code=sp9832a_2h11_volte,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val SP9832A_2H11_VOLTE = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SPRD, code=ums512_1h10, width=720, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPRD, code=ums512_1h10, width=720,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val UMS512_1H10 = "spec:width=720,height=1280,unit=px,dpi=160"

  }
