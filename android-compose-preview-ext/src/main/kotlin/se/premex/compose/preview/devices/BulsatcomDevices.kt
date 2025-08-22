package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Bulsatcom device specifications for Android Compose previews.
 *
 * This extension provides Bulsatcom device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bulsatcom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bulsatcom: Any
  get() = object {
      /** Bulsatcom IMTM741 */
      val IMTM741 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
