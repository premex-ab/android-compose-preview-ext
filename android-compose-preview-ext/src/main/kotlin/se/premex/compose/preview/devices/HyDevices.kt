package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HY device specifications for Android Compose previews.
 *
 * This extension provides HY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hy: Any
  get() = object {
      /** HY HT10LA3MSGNA01 */
      val HT10LA3MSGNA01 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** HY HT10LB4MSGNA01 */
      val HT10LB4MSGNA01 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HY HT10WB3MSG01 */
      val HT10WB3MSG01 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** HY HT8WB3RBK01 */
      val HT8WB3RBK01 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
