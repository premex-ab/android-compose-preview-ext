package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * htccn_chs device specifications for Android Compose previews.
 *
 * This extension provides htccn_chs device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HtccnChs.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HtccnChs: Any
  get() = object {
      /** htccn_chs dlxu */
      val DLXU = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
