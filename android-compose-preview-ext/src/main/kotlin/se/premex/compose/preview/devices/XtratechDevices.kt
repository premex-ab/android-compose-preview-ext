package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Xtratech device specifications for Android Compose previews.
 *
 * This extension provides Xtratech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Xtratech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Xtratech: Any
  get() = object {
      /** Xtratech bnd8163_tb_n */
      val BND8163_TB_N = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Xtratech X10MT87 */
      val X10MT87 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Xtratech X8MT16 */
      val X8MT16 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
