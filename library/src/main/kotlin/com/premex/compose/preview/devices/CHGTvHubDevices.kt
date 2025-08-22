package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CHG_Tv_Hub device specifications for Android Compose previews.
 *
 * This extension provides CHG_Tv_Hub device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CHGTvHub.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CHGTvHub: Any
  get() = object {
      /** CHG_Tv_Hub uzx8020chm */
      val UZX8020CHM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
