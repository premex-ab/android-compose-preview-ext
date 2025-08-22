package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SUNSTECH device specifications for Android Compose previews.
 *
 * This extension provides SUNSTECH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SUNSTECH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SUNSTECH: Any
  get() = object {
      /** SUNSTECH martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SUNSTECH TAB1081 */
      val TAB1081 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SUNSTECH TAB1090 */
      val TAB1090 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
