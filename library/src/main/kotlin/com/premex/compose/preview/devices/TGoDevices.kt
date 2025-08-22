package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * t_go device specifications for Android Compose previews.
 *
 * This extension provides t_go device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TGo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TGo: Any
  get() = object {
      /** t_go TGO_TB850iH */
      val TGO_TB850IH = "spec:width=800,height=1280,unit=px,dpi=213"

  }
