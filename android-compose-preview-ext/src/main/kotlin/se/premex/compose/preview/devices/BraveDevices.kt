package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * BRAVE device specifications for Android Compose previews.
 *
 * This extension provides BRAVE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Brave.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Brave: Any
  get() = object {
      /** BRAVE BT7X1 */
      val BT7X1 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** BRAVE BT8X1 */
      val BT8X1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** BRAVE BTSL1 */
      val BTSL1 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** BRAVE BTXS1 */
      val BTXS1 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** BRAVE EXCEED */
      val EXCEED = "spec:width=800,height=1280,unit=px,dpi=160"

  }
