package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * INNJOO device specifications for Android Compose previews.
 *
 * This extension provides INNJOO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.INNJOO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.INNJOO: Any
  get() = object {
      /** INNJOO F102 */
      val F102 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** INNJOO Superb */
      val SUPERB = "spec:width=800,height=1280,unit=px,dpi=213"

      /** INNJOO VOOM_TAB_LTE */
      val VOOM_TAB_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

  }
