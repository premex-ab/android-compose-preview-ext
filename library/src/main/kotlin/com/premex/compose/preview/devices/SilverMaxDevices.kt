package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SILVER_MAX device specifications for Android Compose previews.
 *
 * This extension provides SILVER_MAX device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SilverMax.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SilverMax: Any
  get() = object {
      /** SILVER_MAX ST_710G */
      val ST_710G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** SILVER_MAX ST-810 */
      val ST_810 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** SILVER_MAX ST_810A */
      val ST_810A = "spec:width=600,height=1024,unit=px,dpi=160"

  }
