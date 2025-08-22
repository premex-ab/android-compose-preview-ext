package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * insignia device specifications for Android Compose previews.
 *
 * This extension provides insignia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Insignia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Insignia: Any
  get() = object {
      /** insignia NS-P10A6100 */
      val NS_P10A6100 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** insignia NS-P11A8100 */
      val NS_P11A8100 = "spec:width=768,height=1366,unit=px,dpi=160"

  }
