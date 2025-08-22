package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * izzi-telecom device specifications for Android Compose previews.
 *
 * This extension provides izzi-telecom device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IzziTelecom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IzziTelecom: Any
  get() = object {
      /** izzi-telecom HP46A */
      val HP46A = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** izzi-telecom HY40A1 */
      val HY40A1 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
