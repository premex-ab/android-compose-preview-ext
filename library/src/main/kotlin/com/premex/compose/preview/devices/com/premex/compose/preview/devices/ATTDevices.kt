package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ATT device specifications for Android Compose previews.
 *
 * This extension provides ATT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ATT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ATT: Any
  get() = object {
      /** DeviceSpec(manufacturer=ATT, code=c71kw200, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATT, code=c71kw200, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val C71KW200 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ATT, code=c71kw400, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATT, code=c71kw400, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val C71KW400 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ATT, code=c71kw400-4gb, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATT, code=c71kw400-4gb, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val C71KW400_4GB = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ATT, code=c71kw400-BEAM, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATT, code=c71kw400-BEAM,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val C71KW400_BEAM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ATT, code=EA211001, width=720, height=1640, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATT, code=EA211001, width=720,
      height=1640, dpi=280, isGoogleDevice=false).code */
      val EA211001 = "spec:width=720,height=1640,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=ATT, code=EA211002, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATT, code=EA211002, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val EA211002 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=ATT, code=EA211005, width=720, height=1640, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATT, code=EA211005, width=720,
      height=1640, dpi=280, isGoogleDevice=false).code */
      val EA211005 = "spec:width=720,height=1640,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=ATT, code=QS5509QL, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATT, code=QS5509QL, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val QS5509QL = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ATT, code=SL219A, width=720, height=1600, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATT, code=SL219A, width=720,
      height=1600, dpi=260, isGoogleDevice=false).code */
      val SL219A = "spec:width=720,height=1600,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=ATT, code=SN509A, width=720, height=1600, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATT, code=SN509A, width=720,
      height=1600, dpi=260, isGoogleDevice=false).code */
      val SN509A = "spec:width=720,height=1600,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=ATT, code=tint8_att, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATT, code=tint8_att, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TINT8_ATT = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ATT, code=U202AA, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATT, code=U202AA, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val U202AA = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ATT, code=U304AA, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATT, code=U304AA, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val U304AA = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ATT, code=U318AA, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATT, code=U318AA, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val U318AA = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ATT, code=U319AA, width=720, height=1440, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATT, code=U319AA, width=720,
      height=1440, dpi=300, isGoogleDevice=false).code */
      val U319AA = "spec:width=720,height=1440,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=ATT, code=U380AA, width=720, height=1560, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATT, code=U380AA, width=720,
      height=1560, dpi=300, isGoogleDevice=false).code */
      val U380AA = "spec:width=720,height=1560,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=ATT, code=U6080AA, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATT, code=U6080AA, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val U6080AA = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=ATT, code=U626AA, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATT, code=U626AA, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val U626AA = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=ATT, code=U705AA, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATT, code=U705AA, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val U705AA = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=ATT, code=WTATTRW2, width=720, height=1440, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATT, code=WTATTRW2, width=720,
      height=1440, dpi=280, isGoogleDevice=false).code */
      val WTATTRW2 = "spec:width=720,height=1440,unit=px,dpi=280"

  }
