package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MTS device specifications for Android Compose previews.
 *
 * This extension provides MTS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mts.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mts: Any
  get() = object {
      /** MTS B866_MTS_IPTV */
      val B866_MTS_IPTV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MTS B866_MTS_OTT */
      val B866_MTS_OTT = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MTS DV8304C */
      val DV8304C = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MTS DV9135-KRM */
      val DV9135_KRM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MTS DV9157-C-KRM */
      val DV9157_C_KRM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
