package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * XTRATECH device specifications for Android Compose previews.
 *
 * This extension provides XTRATECH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XTRATECH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XTRATECH: Any
  get() = object {
      /** XTRATECH BRIO_X31 */
      val BRIO_X31 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** XTRATECH X10MT16 */
      val X10MT16 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** XTRATECH X8MT87 */
      val X8MT87 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
