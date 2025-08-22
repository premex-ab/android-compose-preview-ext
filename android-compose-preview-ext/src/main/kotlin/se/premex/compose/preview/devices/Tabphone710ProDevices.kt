package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TabPhone_710_Pro device specifications for Android Compose previews.
 *
 * This extension provides TabPhone_710_Pro device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tabphone710Pro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tabphone710Pro: Any
  get() = object {
      /** TabPhone_710_Pro Tablet_DL_3420 */
      val TABLET_DL_3420 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
