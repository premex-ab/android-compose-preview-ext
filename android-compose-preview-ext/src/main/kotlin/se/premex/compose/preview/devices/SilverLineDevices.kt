package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Silver_line device specifications for Android Compose previews.
 *
 * This extension provides Silver_line device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SilverLine.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SilverLine: Any
  get() = object {
      /** Silver_line SL1068 */
      val SL1068 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Silver_line SL1069 */
      val SL1069 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Silver_line SL729 */
      val SL729 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
