package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MBO device specifications for Android Compose previews.
 *
 * This extension provides MBO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MBO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MBO: Any
  get() = object {
      /** MBO 16A_Pro */
      val _16A_PRO = "spec:width=720,height=1612,unit=px,dpi=240"

      /** MBO 24S_Ultra */
      val _24S_ULTRA = "spec:width=720,height=1612,unit=px,dpi=240"

  }
