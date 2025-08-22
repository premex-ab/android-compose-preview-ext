package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ELDMandate device specifications for Android Compose previews.
 *
 * This extension provides ELDMandate device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Eldmandate.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Eldmandate: Any
  get() = object {
      /** ELDMandate 10BIZ332 */
      val _10BIZ332 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
