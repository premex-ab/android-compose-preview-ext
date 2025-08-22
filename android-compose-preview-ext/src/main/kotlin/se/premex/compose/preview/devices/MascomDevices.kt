package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MASCOM device specifications for Android Compose previews.
 *
 * This extension provides MASCOM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mascom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mascom: Any
  get() = object {
      /** MASCOM MASCOM_SS289 */
      val MASCOM_SS289 = "spec:width=480,height=800,unit=px,dpi=240"

      /** MASCOM MASCOM_WS517 */
      val MASCOM_WS517 = "spec:width=480,height=856,unit=px,dpi=240"

  }
