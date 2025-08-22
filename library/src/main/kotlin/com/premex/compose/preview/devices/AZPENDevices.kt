package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AZPEN device specifications for Android Compose previews.
 *
 * This extension provides AZPEN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AZPEN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AZPEN: Any
  get() = object {
      /** AZPEN A1046G */
      val A1046G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** AZPEN G800 */
      val G800 = "spec:width=800,height=1280,unit=px,dpi=220"

      /** AZPEN mid1032_mk_32 */
      val MID1032_MK_32 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
