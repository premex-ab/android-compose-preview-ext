package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SoyMomo_Tablet_LITE_3 device specifications for Android Compose previews.
 *
 * This extension provides SoyMomo_Tablet_LITE_3 device specifications that can be used with
 * @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SoyMomoTabletLITE3.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SoyMomoTabletLITE3: Any
  get() = object {
      /** DeviceSpec(manufacturer=SoyMomo_Tablet_LITE_3, code=SoyMomo_Lite_V3, width=600,
      height=1024, dpi=160, isGoogleDevice=false).manufacturer
      DeviceSpec(manufacturer=SoyMomo_Tablet_LITE_3, code=SoyMomo_Lite_V3, width=600, height=1024,
      dpi=160, isGoogleDevice=false).code */
      val SOYMOMO_LITE_V3 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
