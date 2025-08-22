package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * J-COM device specifications for Android Compose previews.
 *
 * This extension provides J-COM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.JCom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.JCom: Any
  get() = object {
      /** J-COM SC40 */
      val SC40 = "spec:width=480,height=800,unit=px,dpi=220"

  }
