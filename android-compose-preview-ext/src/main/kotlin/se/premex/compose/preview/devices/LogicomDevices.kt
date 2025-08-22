package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * logicom device specifications for Android Compose previews.
 *
 * This extension provides logicom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Logicom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Logicom: Any
  get() = object {
      /** logicom La_tab_link_74 */
      val LA_TAB_LINK_74 = "spec:width=600,height=1024,unit=px,dpi=213"

  }
