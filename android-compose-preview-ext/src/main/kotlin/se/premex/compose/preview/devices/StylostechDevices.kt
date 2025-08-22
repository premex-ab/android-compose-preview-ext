package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * StylosTech device specifications for Android Compose previews.
 *
 * This extension provides StylosTech device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Stylostech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Stylostech: Any
  get() = object {
      /** StylosTech Tab2 */
      val TAB2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** StylosTech TAB4 */
      val TAB4 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
