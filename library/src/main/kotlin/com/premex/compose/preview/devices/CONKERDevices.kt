package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CONKER device specifications for Android Compose previews.
 *
 * This extension provides CONKER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CONKER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CONKER: Any
  get() = object {
      /** CONKER ST_60 */
      val ST_60 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** CONKER SX50 */
      val SX50 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
