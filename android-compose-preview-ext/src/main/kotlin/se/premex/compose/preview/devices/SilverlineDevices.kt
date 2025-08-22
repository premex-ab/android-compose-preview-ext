package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SilverLine device specifications for Android Compose previews.
 *
 * This extension provides SilverLine device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Silverline.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Silverline: Any
  get() = object {
      /** SilverLine SL1021 */
      val SL1021 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** SilverLine SL1022 */
      val SL1022 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SilverLine SL721 */
      val SL721 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
