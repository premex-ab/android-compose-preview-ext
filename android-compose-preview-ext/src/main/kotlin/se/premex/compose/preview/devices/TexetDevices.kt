package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Texet device specifications for Android Compose previews.
 *
 * This extension provides Texet device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Texet.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Texet: Any
  get() = object {
      /** Texet TM-5075 */
      val TM_5075 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Texet TM-5076 */
      val TM_5076 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Texet TM-5077 */
      val TM_5077 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Texet TM-5083 */
      val TM_5083 = "spec:width=480,height=960,unit=px,dpi=213"

      /** Texet TM-5084 */
      val TM_5084 = "spec:width=480,height=960,unit=px,dpi=213"

      /** Texet TM-5583 */
      val TM_5583 = "spec:width=480,height=960,unit=px,dpi=213"

      /** Texet TM-5703 */
      val TM_5703 = "spec:width=720,height=1520,unit=px,dpi=320"

  }
